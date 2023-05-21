package com.faendir.awscdkkt.customresources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.customresources.AwsCustomResourceProps

@Generated
public fun awsCustomResourceProps(initializer: AwsCustomResourceProps.Builder.() -> Unit = {}):
    AwsCustomResourceProps = AwsCustomResourceProps.builder().apply(initializer).build()
