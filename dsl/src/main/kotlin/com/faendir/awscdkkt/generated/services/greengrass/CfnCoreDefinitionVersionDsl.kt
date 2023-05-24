package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCoreDefinitionVersion(id: String, props: CfnCoreDefinitionVersionProps):
    CfnCoreDefinitionVersion = CfnCoreDefinitionVersion(this, id, props)

@Generated
public fun Construct.cfnCoreDefinitionVersion(
  id: String,
  props: CfnCoreDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnCoreDefinitionVersion.() -> Unit,
): CfnCoreDefinitionVersion = CfnCoreDefinitionVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCoreDefinitionVersion(id: String, initializer: @AwsCdkDsl
    CfnCoreDefinitionVersion.Builder.() -> Unit): CfnCoreDefinitionVersion =
    CfnCoreDefinitionVersion.Builder.create(this, id).apply(initializer).build()
