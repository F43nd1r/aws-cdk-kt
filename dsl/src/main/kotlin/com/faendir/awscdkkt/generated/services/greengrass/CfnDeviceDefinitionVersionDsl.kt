package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceDefinitionVersion(
  id: String,
  props: CfnDeviceDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnDeviceDefinitionVersion.() -> Unit = {},
): CfnDeviceDefinitionVersion = CfnDeviceDefinitionVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeviceDefinitionVersion(id: String, initializer: @AwsCdkDsl
    CfnDeviceDefinitionVersion.Builder.() -> Unit = {}): CfnDeviceDefinitionVersion =
    CfnDeviceDefinitionVersion.Builder.create(this, id).apply(initializer).build()
