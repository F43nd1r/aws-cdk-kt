package com.faendir.awscdkkt.generated.services.iotfleetwise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelManifest(
  id: String,
  props: CfnModelManifestProps,
  initializer: @AwsCdkDsl CfnModelManifest.() -> Unit = {},
): CfnModelManifest = CfnModelManifest(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelManifest(id: String, initializer: @AwsCdkDsl
    CfnModelManifest.Builder.() -> Unit = {}): CfnModelManifest =
    CfnModelManifest.Builder.create(this, id).apply(initializer).build()
