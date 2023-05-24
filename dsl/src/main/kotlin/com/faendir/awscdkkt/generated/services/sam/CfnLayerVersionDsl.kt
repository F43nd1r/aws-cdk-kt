package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayerVersion(id: String, props: CfnLayerVersionProps): CfnLayerVersion =
    CfnLayerVersion(this, id, props)

@Generated
public fun Construct.cfnLayerVersion(
  id: String,
  props: CfnLayerVersionProps,
  initializer: @AwsCdkDsl CfnLayerVersion.() -> Unit,
): CfnLayerVersion = CfnLayerVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnLayerVersion(id: String): CfnLayerVersion = CfnLayerVersion(this, id)

@Generated
public fun Construct.cfnLayerVersion(id: String, initializer: @AwsCdkDsl
    CfnLayerVersion.() -> Unit): CfnLayerVersion = CfnLayerVersion(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnLayerVersion(id: String, initializer: @AwsCdkDsl
    CfnLayerVersion.Builder.() -> Unit): CfnLayerVersion = CfnLayerVersion.Builder.create(this,
    id).apply(initializer).build()
