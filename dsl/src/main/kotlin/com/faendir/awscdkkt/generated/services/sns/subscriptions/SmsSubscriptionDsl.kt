package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SmsSubscription

@Generated
public fun buildSmsSubscription(phoneNumber: String, initializer: @AwsCdkDsl SmsSubscription.Builder.() -> Unit = {}): SmsSubscription = SmsSubscription.Builder.create(phoneNumber).apply(initializer).build()
