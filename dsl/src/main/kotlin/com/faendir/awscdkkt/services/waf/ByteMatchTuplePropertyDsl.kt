package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnByteMatchSet

@Generated
public
    fun byteMatchTupleProperty(initializer: CfnByteMatchSet.ByteMatchTupleProperty.Builder.() -> Unit
    = {}): CfnByteMatchSet.ByteMatchTupleProperty =
    CfnByteMatchSet.ByteMatchTupleProperty.builder().apply(initializer).build()
