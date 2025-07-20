package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscription
import software.amazon.awscdk.services.ses.CfnMailManagerAddonSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerAddonSubscription(
  id: String,
  props: CfnMailManagerAddonSubscriptionProps,
  initializer: @AwsCdkDsl CfnMailManagerAddonSubscription.() -> Unit = {},
): CfnMailManagerAddonSubscription = CfnMailManagerAddonSubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerAddonSubscription(id: String, initializer: @AwsCdkDsl CfnMailManagerAddonSubscription.Builder.() -> Unit = {}): CfnMailManagerAddonSubscription = CfnMailManagerAddonSubscription.Builder.create(this, id).apply(initializer).build()
