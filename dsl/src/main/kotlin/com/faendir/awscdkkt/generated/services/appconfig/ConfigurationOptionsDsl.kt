package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.ConfigurationOptions

@Generated
public fun buildConfigurationOptions(initializer: @AwsCdkDsl ConfigurationOptions.Builder.() -> Unit
    = {}): ConfigurationOptions = ConfigurationOptions.Builder().apply(initializer).build()
