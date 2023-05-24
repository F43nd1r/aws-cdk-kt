package com.faendir.awscdkkt.generated.services.codestarnotifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.NotificationRule
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.notificationRule(id: String, props: NotificationRuleProps): NotificationRule =
    NotificationRule(this, id, props)

@Generated
public fun Construct.notificationRule(
  id: String,
  props: NotificationRuleProps,
  initializer: @AwsCdkDsl NotificationRule.() -> Unit,
): NotificationRule = NotificationRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNotificationRule(id: String, initializer: @AwsCdkDsl
    NotificationRule.Builder.() -> Unit): NotificationRule = NotificationRule.Builder.create(this,
    id).apply(initializer).build()
