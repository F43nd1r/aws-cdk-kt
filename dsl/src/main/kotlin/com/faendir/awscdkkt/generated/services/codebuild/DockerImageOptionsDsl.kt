package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.DockerImageOptions

@Generated
public fun buildDockerImageOptions(initializer: @AwsCdkDsl DockerImageOptions.Builder.() -> Unit =
    {}): DockerImageOptions = DockerImageOptions.Builder().apply(initializer).build()
