@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
import software.constructs.Construct

public fun Construct.cfnDecoderManifest(
  id: String,
  props: CfnDecoderManifestProps,
  initializer: CfnDecoderManifest.() -> Unit = {},
): CfnDecoderManifest = CfnDecoderManifest(this, id, props).apply(initializer)
