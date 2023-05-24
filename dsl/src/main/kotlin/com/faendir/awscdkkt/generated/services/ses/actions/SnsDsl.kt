package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.Sns
import software.amazon.awscdk.services.ses.actions.SnsProps

@Generated
public fun sns(props: SnsProps): Sns = Sns(props)

@Generated
public fun buildSns(initializer: @AwsCdkDsl Sns.Builder.() -> Unit): Sns =
    Sns.Builder.create().apply(initializer).build()
