package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.BounceTemplate

@Generated
public fun buildBounceTemplate(initializer: @AwsCdkDsl BounceTemplate.Builder.() -> Unit = {}):
    BounceTemplate = BounceTemplate.Builder.create().apply(initializer).build()
