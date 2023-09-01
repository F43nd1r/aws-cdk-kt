package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscription

@Generated
public fun buildEmailSubscription(emailAddress: String, initializer: @AwsCdkDsl
    EmailSubscription.Builder.() -> Unit = {}): EmailSubscription =
    EmailSubscription.Builder.create(emailAddress).apply(initializer).build()
