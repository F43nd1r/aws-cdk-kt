package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.Lambda

@Generated
public fun buildLambda(initializer: @AwsCdkDsl Lambda.Builder.() -> Unit): Lambda =
    Lambda.Builder.create().apply(initializer).build()
