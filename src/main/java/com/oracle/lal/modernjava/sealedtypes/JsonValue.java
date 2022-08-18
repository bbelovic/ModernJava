package com.oracle.lal.modernjava.sealedtypes;

public sealed class JsonValue permits JSONArray, JSONNumber, JSONString {
}
