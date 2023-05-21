package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucket

@Generated
public
    fun filterAndOperatorProperty(initializer: CfnBucket.FilterAndOperatorProperty.Builder.() -> Unit
    = {}): CfnBucket.FilterAndOperatorProperty =
    CfnBucket.FilterAndOperatorProperty.builder().apply(initializer).build()
