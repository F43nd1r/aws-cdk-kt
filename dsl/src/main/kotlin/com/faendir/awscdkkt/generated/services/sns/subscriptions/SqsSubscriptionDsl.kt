package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun sqsSubscription(queue: IQueue): SqsSubscription = SqsSubscription(queue)

@Generated
public fun sqsSubscription(queue: IQueue, props: SqsSubscriptionProps): SqsSubscription =
    SqsSubscription(queue, props)

@Generated
public fun buildSqsSubscription(queue: IQueue, initializer: @AwsCdkDsl
    SqsSubscription.Builder.() -> Unit): SqsSubscription =
    SqsSubscription.Builder.create(queue).apply(initializer).build()
