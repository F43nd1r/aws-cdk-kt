package com.faendir.awscdkkt.generated.services.greengrass

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriptionDefinitionVersion(id: String,
    props: CfnSubscriptionDefinitionVersionProps): CfnSubscriptionDefinitionVersion =
    CfnSubscriptionDefinitionVersion(this, id, props)

@Generated
public fun Construct.cfnSubscriptionDefinitionVersion(
  id: String,
  props: CfnSubscriptionDefinitionVersionProps,
  initializer: @AwsCdkDsl CfnSubscriptionDefinitionVersion.() -> Unit,
): CfnSubscriptionDefinitionVersion = CfnSubscriptionDefinitionVersion(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscriptionDefinitionVersion(id: String, initializer: @AwsCdkDsl
    CfnSubscriptionDefinitionVersion.Builder.() -> Unit): CfnSubscriptionDefinitionVersion =
    CfnSubscriptionDefinitionVersion.Builder.create(this, id).apply(initializer).build()
