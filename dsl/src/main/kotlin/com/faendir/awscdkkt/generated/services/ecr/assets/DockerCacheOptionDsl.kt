package com.faendir.awscdkkt.generated.services.ecr.assets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption

@Generated
public fun buildDockerCacheOption(initializer: @AwsCdkDsl DockerCacheOption.Builder.() -> Unit):
    DockerCacheOption = DockerCacheOption.Builder().apply(initializer).build()
