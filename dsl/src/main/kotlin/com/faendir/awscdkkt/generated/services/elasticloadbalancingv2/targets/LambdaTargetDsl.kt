package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2.targets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.elasticloadbalancingv2.targets.LambdaTarget
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun lambdaTarget(fn: IFunction): LambdaTarget = LambdaTarget(fn)
