package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscription
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps

@Generated
public fun emailSubscription(emailAddress: String): EmailSubscription =
    EmailSubscription(emailAddress)

@Generated
public fun emailSubscription(emailAddress: String, props: EmailSubscriptionProps): EmailSubscription
    = EmailSubscription(emailAddress, props)

@Generated
public fun buildEmailSubscription(emailAddress: String, initializer: @AwsCdkDsl
    EmailSubscription.Builder.() -> Unit): EmailSubscription =
    EmailSubscription.Builder.create(emailAddress).apply(initializer).build()
