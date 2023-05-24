package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDefinitionVersion(id: String,
    props: CfnResourceDefinitionVersionProps): CfnResourceDefinitionVersion =
    CfnResourceDefinitionVersion(this, id, props)

@Generated
public fun Construct.cfnResourceDefinitionVersion(
  id: String,
  props: CfnResourceDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnResourceDefinitionVersion.() -> Unit,
): CfnResourceDefinitionVersion = CfnResourceDefinitionVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceDefinitionVersion(id: String, initializer: @AwsCdkDsl
    CfnResourceDefinitionVersion.Builder.() -> Unit): CfnResourceDefinitionVersion =
    CfnResourceDefinitionVersion.Builder.create(this, id).apply(initializer).build()
