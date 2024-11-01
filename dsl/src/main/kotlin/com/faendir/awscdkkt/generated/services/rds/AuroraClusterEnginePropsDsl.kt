@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.rds.AuroraClusterEngineProps

@Deprecated(message =
    "software.amazon.awscdk.services.rds.AuroraClusterEngineProps is deprecated in CDK.")
@Generated
public fun buildAuroraClusterEngineProps(initializer: @AwsCdkDsl
    AuroraClusterEngineProps.Builder.() -> Unit = {}): AuroraClusterEngineProps =
    AuroraClusterEngineProps.Builder().apply(initializer).build()
