package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCalculatedAttributeDefinition(
  id: String,
  props: CfnCalculatedAttributeDefinitionProps,
  initializer: @AwsCdkDsl CfnCalculatedAttributeDefinition.() -> Unit = {},
): CfnCalculatedAttributeDefinition = CfnCalculatedAttributeDefinition(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnCalculatedAttributeDefinition(id: String, initializer: @AwsCdkDsl
    CfnCalculatedAttributeDefinition.Builder.() -> Unit = {}): CfnCalculatedAttributeDefinition =
    CfnCalculatedAttributeDefinition.Builder.create(this, id).apply(initializer).build()
