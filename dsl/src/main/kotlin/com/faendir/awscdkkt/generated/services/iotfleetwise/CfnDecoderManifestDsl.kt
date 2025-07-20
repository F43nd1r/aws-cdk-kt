package com.faendir.awscdkkt.generated.services.iotfleetwise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDecoderManifest(
  id: String,
  props: CfnDecoderManifestProps,
  initializer: @AwsCdkDsl CfnDecoderManifest.() -> Unit = {},
): CfnDecoderManifest = CfnDecoderManifest(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDecoderManifest(id: String, initializer: @AwsCdkDsl CfnDecoderManifest.Builder.() -> Unit = {}): CfnDecoderManifest = CfnDecoderManifest.Builder.create(this, id).apply(initializer).build()
