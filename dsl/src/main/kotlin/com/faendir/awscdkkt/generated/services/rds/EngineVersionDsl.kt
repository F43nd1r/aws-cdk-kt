package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.EngineVersion

@Generated
public fun buildEngineVersion(initializer: @AwsCdkDsl EngineVersion.Builder.() -> Unit = {}):
    EngineVersion = EngineVersion.Builder().apply(initializer).build()
