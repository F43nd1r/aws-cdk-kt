package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubSourceProps

@Generated
public fun buildGitHubSourceProps(initializer: @AwsCdkDsl GitHubSourceProps.Builder.() -> Unit =
    {}): GitHubSourceProps = GitHubSourceProps.Builder().apply(initializer).build()
