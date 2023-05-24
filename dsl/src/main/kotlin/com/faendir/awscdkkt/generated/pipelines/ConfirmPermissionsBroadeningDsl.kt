package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps

@Generated
public fun confirmPermissionsBroadening(id: String, props: PermissionsBroadeningCheckProps):
    ConfirmPermissionsBroadening = ConfirmPermissionsBroadening(id, props)

@Generated
public fun buildConfirmPermissionsBroadening(id: String, initializer: @AwsCdkDsl
    ConfirmPermissionsBroadening.Builder.() -> Unit): ConfirmPermissionsBroadening =
    ConfirmPermissionsBroadening.Builder.create(id).apply(initializer).build()
