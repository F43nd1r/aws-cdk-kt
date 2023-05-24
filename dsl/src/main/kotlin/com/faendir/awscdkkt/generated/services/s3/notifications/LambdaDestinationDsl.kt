package com.faendir.awscdkkt.generated.services.s3.notifications

import javax.`annotation`.Generated
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.s3.notifications.LambdaDestination

@Generated
public fun lambdaDestination(fn: IFunction): LambdaDestination = LambdaDestination(fn)
