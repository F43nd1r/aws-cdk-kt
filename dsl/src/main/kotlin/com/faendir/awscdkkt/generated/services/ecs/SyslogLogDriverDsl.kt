package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.SyslogLogDriver

@Generated
public fun buildSyslogLogDriver(initializer: @AwsCdkDsl SyslogLogDriver.Builder.() -> Unit):
    SyslogLogDriver = SyslogLogDriver.Builder.create().apply(initializer).build()
