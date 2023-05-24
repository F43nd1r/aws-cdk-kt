package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscription
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps

@Generated
public fun urlSubscription(url: String): UrlSubscription = UrlSubscription(url)

@Generated
public fun urlSubscription(url: String, props: UrlSubscriptionProps): UrlSubscription =
    UrlSubscription(url, props)

@Generated
public fun buildUrlSubscription(url: String, initializer: @AwsCdkDsl
    UrlSubscription.Builder.() -> Unit): UrlSubscription =
    UrlSubscription.Builder.create(url).apply(initializer).build()
