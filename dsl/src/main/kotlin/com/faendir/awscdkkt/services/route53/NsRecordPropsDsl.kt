package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.NsRecordProps

@Generated
public fun nsRecordProps(initializer: NsRecordProps.Builder.() -> Unit = {}): NsRecordProps =
    NsRecordProps.builder().apply(initializer).build()
