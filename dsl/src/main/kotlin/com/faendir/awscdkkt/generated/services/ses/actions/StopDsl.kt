package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.Stop

@Generated
public fun buildStop(initializer: @AwsCdkDsl Stop.Builder.() -> Unit = {}): Stop =
    Stop.Builder.create().apply(initializer).build()
