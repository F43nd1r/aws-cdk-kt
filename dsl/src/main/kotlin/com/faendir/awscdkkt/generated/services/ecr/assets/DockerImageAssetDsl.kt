package com.faendir.awscdkkt.generated.services.ecr.assets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
import software.constructs.Construct

@Generated
public fun Construct.dockerImageAsset(id: String, props: DockerImageAssetProps): DockerImageAsset =
    DockerImageAsset(this, id, props)

@Generated
public fun Construct.dockerImageAsset(
  id: String,
  props: DockerImageAssetProps,
  initializer: @AwsCdkDsl DockerImageAsset.() -> Unit,
): DockerImageAsset = DockerImageAsset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDockerImageAsset(id: String, initializer: @AwsCdkDsl
    DockerImageAsset.Builder.() -> Unit): DockerImageAsset = DockerImageAsset.Builder.create(this,
    id).apply(initializer).build()
