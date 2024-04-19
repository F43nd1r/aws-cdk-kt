package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.ZoneSigningOptions

@Generated
public fun buildZoneSigningOptions(initializer: @AwsCdkDsl ZoneSigningOptions.Builder.() -> Unit =
    {}): ZoneSigningOptions = ZoneSigningOptions.Builder().apply(initializer).build()
