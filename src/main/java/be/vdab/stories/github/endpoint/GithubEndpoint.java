package be.vdab.stories.github.endpoint;

import be.vdab.stories.github.domain.GithubCommit;
import be.vdab.stories.github.domain.GithubRelease;

import javax.ws.rs.*;
import java.util.List;

public interface GithubEndpoint {

    @GET
    @Path("/repos/{user}/{repo}/commits")
    @Produces("application/vnd.github.v3+json")
    List<GithubCommit> getCommits(
            @HeaderParam("user-agent") String userAgent,
            @HeaderParam("Authorization") String authorization,
            @PathParam("user") String user,
            @PathParam("repo") String repo,
            @QueryParam("page") int page,
            @QueryParam("per_page") int perPage
    );

    @GET
    @Path("/repos/{user}/{repo}/tags")
    @Produces("application/vnd.github.v3+json")
    List<GithubRelease> getReleases(
            @HeaderParam("user-agent") String userAgent,
            @HeaderParam("Authorization") String authorization,
            @PathParam("user") String user,
            @PathParam("repo") String repo,
            @QueryParam("page") int page,
            @QueryParam("per_page") int perPage
    );
}
