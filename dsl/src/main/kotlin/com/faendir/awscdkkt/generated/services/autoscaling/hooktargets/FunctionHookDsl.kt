package com.faendir.awscdkkt.generated.services.autoscaling.hooktargets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.autoscaling.hooktargets.FunctionHook
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun functionHook(fn: IFunction): FunctionHook = FunctionHook(fn)

@Generated
public fun functionHook(fn: IFunction, encryptionKey: IKey): FunctionHook = FunctionHook(fn,
    encryptionKey)
