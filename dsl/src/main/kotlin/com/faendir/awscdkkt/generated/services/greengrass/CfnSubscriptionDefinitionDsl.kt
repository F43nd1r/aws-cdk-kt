package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriptionDefinition(id: String, props: CfnSubscriptionDefinitionProps):
    CfnSubscriptionDefinition = CfnSubscriptionDefinition(this, id, props)

@Generated
public fun Construct.cfnSubscriptionDefinition(
  id: String,
  props: CfnSubscriptionDefinitionProps,
  initializer: @AwsCdkDsl CfnSubscriptionDefinition.() -> Unit,
): CfnSubscriptionDefinition = CfnSubscriptionDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscriptionDefinition(id: String, initializer: @AwsCdkDsl
    CfnSubscriptionDefinition.Builder.() -> Unit): CfnSubscriptionDefinition =
    CfnSubscriptionDefinition.Builder.create(this, id).apply(initializer).build()
