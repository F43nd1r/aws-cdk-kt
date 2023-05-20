@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
import software.constructs.Construct

public fun Construct.dockerImageAsset(
  id: String,
  props: DockerImageAssetProps,
  initializer: DockerImageAsset.() -> Unit = {},
): DockerImageAsset = DockerImageAsset(this, id, props).apply(initializer)
