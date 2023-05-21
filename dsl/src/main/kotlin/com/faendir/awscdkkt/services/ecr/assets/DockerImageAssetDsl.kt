package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
import software.constructs.Construct

@Generated
public fun Construct.dockerImageAsset(
  id: String,
  props: DockerImageAssetProps,
  initializer: DockerImageAsset.() -> Unit = {},
): DockerImageAsset = DockerImageAsset(this, id, props).apply(initializer)
