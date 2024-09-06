package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.RedshiftQueryProps

@Generated
public fun buildRedshiftQueryProps(initializer: @AwsCdkDsl RedshiftQueryProps.Builder.() -> Unit =
    {}): RedshiftQueryProps = RedshiftQueryProps.Builder().apply(initializer).build()
