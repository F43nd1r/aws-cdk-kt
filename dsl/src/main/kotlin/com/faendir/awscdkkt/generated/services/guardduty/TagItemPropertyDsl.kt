package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector

@Generated
public fun buildTagItemProperty(initializer: @AwsCdkDsl
    CfnDetector.TagItemProperty.Builder.() -> Unit = {}): CfnDetector.TagItemProperty =
    CfnDetector.TagItemProperty.Builder().apply(initializer).build()