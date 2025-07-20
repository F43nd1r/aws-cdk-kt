package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceDefinition(
  id: String,
  props: CfnDeviceDefinitionProps,
  initializer: @AwsCdkDsl CfnDeviceDefinition.() -> Unit = {},
): CfnDeviceDefinition = CfnDeviceDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeviceDefinition(id: String, initializer: @AwsCdkDsl CfnDeviceDefinition.Builder.() -> Unit = {}): CfnDeviceDefinition = CfnDeviceDefinition.Builder.create(this, id).apply(initializer).build()
