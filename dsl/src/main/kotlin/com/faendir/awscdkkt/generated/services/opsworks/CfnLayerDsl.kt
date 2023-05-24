package com.faendir.awscdkkt.generated.services.opsworks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayer(id: String, props: CfnLayerProps): CfnLayer = CfnLayer(this, id,
    props)

@Generated
public fun Construct.cfnLayer(
  id: String,
  props: CfnLayerProps,
  initializer: @AwsCdkDsl CfnLayer.() -> Unit,
): CfnLayer = CfnLayer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLayer(id: String, initializer: @AwsCdkDsl CfnLayer.Builder.() -> Unit):
    CfnLayer = CfnLayer.Builder.create(this, id).apply(initializer).build()
