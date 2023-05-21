package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

@Generated
public fun outputLocationProperty(initializer: CfnJob.OutputLocationProperty.Builder.() -> Unit =
    {}): CfnJob.OutputLocationProperty =
    CfnJob.OutputLocationProperty.builder().apply(initializer).build()
