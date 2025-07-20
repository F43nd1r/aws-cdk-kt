package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscription

@Generated
public fun buildUrlSubscription(url: String, initializer: @AwsCdkDsl UrlSubscription.Builder.() -> Unit = {}): UrlSubscription = UrlSubscription.Builder.create(url).apply(initializer).build()
