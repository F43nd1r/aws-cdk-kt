package com.faendir.awscdkkt.generated.services.ses.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.Stop
import software.amazon.awscdk.services.ses.actions.StopProps

@Generated
public fun stop(): Stop = Stop()

@Generated
public fun stop(props: StopProps): Stop = Stop(props)

@Generated
public fun buildStop(initializer: @AwsCdkDsl Stop.Builder.() -> Unit): Stop =
    Stop.Builder.create().apply(initializer).build()
