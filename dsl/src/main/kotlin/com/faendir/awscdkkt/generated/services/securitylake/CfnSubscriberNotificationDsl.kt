package com.faendir.awscdkkt.generated.services.securitylake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securitylake.CfnSubscriberNotification
import software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriberNotification(
  id: String,
  props: CfnSubscriberNotificationProps,
  initializer: @AwsCdkDsl CfnSubscriberNotification.() -> Unit = {},
): CfnSubscriberNotification = CfnSubscriberNotification(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscriberNotification(id: String, initializer: @AwsCdkDsl CfnSubscriberNotification.Builder.() -> Unit = {}): CfnSubscriberNotification = CfnSubscriberNotification.Builder.create(this, id).apply(initializer).build()
