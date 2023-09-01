package com.faendir.awscdkkt.generated.services.iotfleetwise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle
import software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVehicle(
  id: String,
  props: CfnVehicleProps,
  initializer: @AwsCdkDsl CfnVehicle.() -> Unit = {},
): CfnVehicle = CfnVehicle(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVehicle(id: String, initializer: @AwsCdkDsl
    CfnVehicle.Builder.() -> Unit = {}): CfnVehicle = CfnVehicle.Builder.create(this,
    id).apply(initializer).build()
