package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.Bounce
import software.amazon.awscdk.services.ses.actions.BounceProps

@Generated
public fun bounce(props: BounceProps): Bounce = Bounce(props)

@Generated
public fun buildBounce(initializer: @AwsCdkDsl Bounce.Builder.() -> Unit): Bounce =
    Bounce.Builder.create().apply(initializer).build()
