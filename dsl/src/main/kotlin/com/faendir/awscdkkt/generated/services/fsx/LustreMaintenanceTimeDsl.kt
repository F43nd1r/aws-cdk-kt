package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.LustreMaintenanceTime
import software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps

@Generated
public fun lustreMaintenanceTime(props: LustreMaintenanceTimeProps): LustreMaintenanceTime =
    LustreMaintenanceTime(props)

@Generated
public fun buildLustreMaintenanceTime(initializer: @AwsCdkDsl
    LustreMaintenanceTime.Builder.() -> Unit): LustreMaintenanceTime =
    LustreMaintenanceTime.Builder.create().apply(initializer).build()
