@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
