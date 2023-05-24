package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.SyslogLogDriver
import software.amazon.awscdk.services.ecs.SyslogLogDriverProps

@Generated
public fun syslogLogDriver(): SyslogLogDriver = SyslogLogDriver()

@Generated
public fun syslogLogDriver(props: SyslogLogDriverProps): SyslogLogDriver = SyslogLogDriver(props)

@Generated
public fun buildSyslogLogDriver(initializer: @AwsCdkDsl SyslogLogDriver.Builder.() -> Unit):
    SyslogLogDriver = SyslogLogDriver.Builder.create().apply(initializer).build()
